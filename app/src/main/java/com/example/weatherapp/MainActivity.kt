package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.example.weatherapp.ui.theme.WeatherAppTheme


class MainActivity : ComponentActivity() {

    private val apiKey = "c7a62be49ccebb998e2f01ed0cf463d5"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WeatherAppTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    WeatherApp(apiKey = apiKey)
                }
            }
        }
    }
}

@Composable
fun WeatherApp(apiKey: String, viewModel: WeatherViewModel = viewModel()) {
    var city by remember { mutableStateOf(TextFieldValue("")) }
    val weather by viewModel.weather.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = city,
            onValueChange = { city = it },
            label = { Text("Enter City") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(12.dp))

        Button(onClick = {
            viewModel.fetchWeather(city.text, apiKey)
        }) {
            Text("Get Weather")
        }

        Spacer(modifier = Modifier.height(24.dp))

        weather?.let {
            Text("City: ${it.name}", style = MaterialTheme.typography.headlineSmall)
            Text("Temperature: ${it.main.temp} °C")
            Text("Condition: ${it.weather[0].description}")

            AsyncImage(
                model = "https://openweathermap.org/img/wn/${it.weather[0].icon}@2x.png",
                contentDescription = "Weather Icon",
                modifier = Modifier.size(100.dp)
            )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun WeatherPreview() {
    WeatherAppTheme {
        // You can mock the API or just comment this during preview
        Text("Weather preview here")
    }
}
