/**
 * @param {number} n
 * @param {number[][]} buildings
 * @return {number}
 */
var countCoveredBuildings = function(n, buildings) {
    //ignore the inversed y-axis, it is still the same thing

    //n is given just to provide the max point on x/y axis (just a helper, nothing to do with problem)
    let maxX = new Array(n+1).fill(-Infinity)
    let minX = new Array(n+1).fill(Infinity)
    let maxY = new Array(n+1).fill(-Infinity)
    let minY = new Array(n+1).fill(Infinity) 

    for(let [x,y] of buildings){
       maxX[y] = Math.max(maxX[y],x) //maximum 'x' point at that specific 'y'
       minX[y] = Math.min(minX[y],x) //minimum 'x' point at that specific 'y'
       maxY[x] = Math.max(maxY[x],y) //maximum 'y' point at that specific 'x'
       minY[x] = Math.min(minY[x],y) //minimum 'y' point at that specific 'x'  
    }

    let count =0

    for(let [x,y] of buildings){
        if(x>minX[y] && x<maxX[y] && y>minY[x] && y<maxY[x]){
            count++
        }
    }

    return count
};
