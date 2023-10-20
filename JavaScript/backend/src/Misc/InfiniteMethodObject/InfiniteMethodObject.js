/**
 * @return {Object}
 */
var createInfiniteObject = function (args) {
  let object = {} // This is made up
  let handler = {
    get: (target, property) => {
      return () => property
    },
  }

  let proxy = new Proxy(object, handler)
  return proxy
}

const obj = createInfiniteObject()
console.log('name: ' + obj['abc123']()) // "abc123"
