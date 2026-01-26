/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function(promise1, promise2) {
    //Set variables equal to promises and ensure that await is
    //used to pause the execution until the promises are resolved
    let a = await promise1
    let b = await promise2

    //Set c equal to the sum of a and b and return c
    let c = a + b
    return c;
};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */
