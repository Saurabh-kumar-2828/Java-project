<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Weather App</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
    <h2>Weather Information</h2>
    <input type="text" id="city" placeholder="Enter city name">
    <button onclick="getWeather()">Get Weather</button>
    <p id="weatherResult"></p>

    <script>
        function getWeather() {
            let city = $('#city').val();
            if (!city) {
                alert("Please enter a city name");
                return;
            }
            
            $.ajax({
                url: "http://localhost:8080/weather/" + city,
                type: "GET",
                success: function(response) {
                    $('#weatherResult').text(response);
                },
                error: function() {
                    $('#weatherResult').text("Error fetching weather data");
                }
            });
        }
    </script>
</body>
</html>
