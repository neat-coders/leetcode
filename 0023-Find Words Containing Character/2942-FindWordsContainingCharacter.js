/**
 * @param {string[]} words
 * @param {character} x
 * @return {number[]}
 */
var findWordsContaining = function(words, x) {
    let  result=[];
     for(i=0;i<words.length;i++){
         let word=words[i];
         for (j=0;j<word.length;j++){
             if(word[j]==x){
                result.push(i);
                break;
             }
         }
     }
     return result;
 };