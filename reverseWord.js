let sentence = "This is a sunny day";
let words = sentence.split(" ");

for (let i = 0; i < words.length; i++) {
    let low = 0;
    let high = words[i].length - 1;
    let chars = words[i].split('');

    while (low < high) {
        [chars[low], chars[high]] = [chars[high], chars[low]];
        low++;
        high--;
    }

    words[i] = chars.join('');
}

let reversedSentence = words.join(' ');

console.log(reversedSentence);

