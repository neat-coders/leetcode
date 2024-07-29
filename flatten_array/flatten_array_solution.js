const {deepStrictEqual} = require('node:assert/strict');

const challenge = (input = {}) => {
    let stack = [{key: '', value: input}];
    let ret = {};

    while (stack.length) {
        let current = stack.pop();
        for (const [key, value] of Object.entries(current.value)) {
            if (typeof value === 'object') {
                stack.push({key: current.key + '.' + key, value: value});
            } else {
                let concatinatedKey = (current.key + '.' + key).slice(1); // remove first '.' in the key name
                ret[concatinatedKey] = value;
            }
        }
    }
    return ret;
};

deepStrictEqual(
    challenge({
        a: {
            b: {
                c: 1,
                f: 2,
            },
            g: 3,
        },
        d: 2,
    }),
    {
        'a.b.c': 1,
        'a.b.f': 2,
        'a.g': 3,
        d: 2,
    },
);