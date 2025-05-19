# 🌤️ Weather Android App

A simple and elegant Weather App built using **Jetpack Compose**, **Retrofit**, and **OpenWeatherMap API**. This app allows users to fetch and view real-time weather information for any city, with a clean Compose UI and optional scenic background.

---

## 📱 Features

- 🌐 Live weather data using [OpenWeatherMap](https://openweathermap.org/)
- 🔍 Search weather by city name
- 🌡️ Shows temperature, condition, and icon
- 🎨 Jetpack Compose UI with scenic background
- 🔄 MVVM architecture using `ViewModel` and `StateFlow`

---

## 📂 Project Structure

weather_App/                                                                        
├── app/                                                                
│ ├── src/                                                                     
│ │ ├── main/                                                                                 
│ │ │ ├── java/com/example/weatherapp/                                                                           
│ │ │ │ ├── MainActivity.kt # App entry point and Compose UI                                                            
│ │ │ │ ├── WeatherViewModel.kt # ViewModel (MVVM logic)                                                                 
│ │ │ │ ├── data/                                                                                      
│ │ │ │ │ └── WeatherResponse.kt # Data models for JSON response                                                        
│ │ │ │ ├── network/                                                                    
│ │ │ │ │ ├── RetrofitClient.kt # Retrofit setup                                                   
│ │ │ │ │ └── WeatherApi.kt # API endpoints                                                           
│ │ │ └── res/                                                                                     
│ │ │ └── drawable
│ ├── build.gradle.kts
├── .gitignore
├── settings.gradle.kts

## 🔧 Tech Stack

- **Kotlin**
- **Jetpack Compose**
- **Retrofit 2**
- **Coil (for weather icons)**
- **MVVM architecture**
- **OpenWeatherMap API**

---

## 🚀 How to Run
Clone the repo:
      git clone https://github.com/deadheaven07/Weather_Android.git
## TO Preview and download APK
https://drive.google.com/file/d/1jQYG_okG2iQHJzaks-1_poVvMV68I1Pw/view?usp=sharing
   
