let arr = [11, 22, 33, 44, 66, 55, 99, 77,127];
let max;

for (let i = 0; i < arr.length; i++) {
    max = i;
    for (let j = i + 1; j < arr.length; j++) {
        if (arr[j] > arr[max]) {
            max = j;
        }
    }

    [arr[i], arr[max]] = [arr[max], arr[i]];
}

console.log(arr);
