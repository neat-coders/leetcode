const { deepStrictEqual } = require('node:assert/strict');

const challenge = (input = {}) => {
 // TODO: implement this function
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