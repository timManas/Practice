/**
 * @param {number} celsius
 * @return {number[]}
 */
var convertTemperature = function (celsius) {
  let kelvin = parseFloat(celsius) + 273.15
  let fahrenheit = parseFloat(celsius) * 1.8 + 32.0

  console.log('kelvin: ' + kelvin + '      fahrenheit: ' + fahrenheit)
  return [kelvin, fahrenheit]
}

let input = [36.5, 122.11]
for (let i of input) {
  console.log('Output: ' + convertTemperature(i))
}
