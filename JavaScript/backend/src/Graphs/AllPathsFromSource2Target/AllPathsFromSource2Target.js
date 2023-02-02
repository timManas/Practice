/**
 * @param {number[][]} graph
 * @return {number[][]}
 */
var allPathsSourceTarget = function (graph) {
  // Use DFS to start from 0 to n
  let output = []

  let stack = []
  traverseGraph(0, graph.length - 1, [], graph)

  return output
}

function traverseGraph(current, end, stack, graph) {
  console.log('Current: ' + current)

  // Put values into stack

  if (current == end) {
    // Backtrack
    console.log('End ----')
  } else {
    stack.push(graph[current])
  }
}

let graph = [[1, 2], [3], [3], []]
console.log('Paths: ' + allPathsSourceTarget(graph))

let graph1 = [[4, 3, 1], [3, 2, 4], [3], [4], []]
console.log('Paths: ' + allPathsSourceTarget(graph1))
