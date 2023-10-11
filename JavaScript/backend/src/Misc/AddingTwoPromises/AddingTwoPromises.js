/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function (promise1, promise2) {
  let promise1Result = await promise1
  let promise2Result = await promise2

  return new Promise((resolve, reject) => {
    resolve(promise1Result + promise2Result)
  })
}

addTwoPromises(Promise.resolve(2), Promise.resolve(2)).then(console.log) // 4
