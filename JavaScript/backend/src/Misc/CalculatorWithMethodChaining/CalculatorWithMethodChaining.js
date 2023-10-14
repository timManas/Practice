class Calculator {
  /**
   * @param {number} value
   */
  constructor(value) {}

  /**
   * @param {number} value
   * @return {Calculator}
   */
  add(value) {}

  /**
   * @param {number} value
   * @return {Calculator}
   */
  subtract(value) {}

  /**
   * @param {number} value
   * @return {Calculator}
   */
  multiply(value) {}

  /**
   * @param {number} value
   * @return {Calculator}
   */
  divide(value) {}

  /**
   * @param {number} value
   * @return {Calculator}
   */
  power(value) {}

  /**
   * @return {number}
   */
  getResult() {}
}

let actions = ['Calculator', 'add', 'subtract', 'getResult']
let values = [10, 5, 7]
console.log(new Calculator(10).add(5).subtract(7).getResult())

actions = ['Calculator', 'multiply', 'power', 'getResult']
values = [2, 5, 2]
console.log(new Calculator(2).multiply(5).power(2).getResult())

actions = ['Calculator', 'divide', 'getResult']
values = [20, 0]
console.log(new Calculator(20).divide(0).getResult())
