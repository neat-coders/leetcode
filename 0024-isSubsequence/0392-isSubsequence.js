/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isSubsequence = function(s, t) {
    let pointer = 0;
    if (s == "") {
        return true;
    }
    for(let i = 0 ; i < t.length ; i++) {
        if(t.charAt(i) == s.charAt(pointer)) {
            pointer++;
            if(pointer==s.length) {
                return true;
            }
        }
    }
    return false;
};