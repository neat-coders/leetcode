class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        def modifyStr(st:str)->str:
            stack=[]
            for val in st:
                if stack and val=="#":
                    stack.pop()
                elif val!='#':
                    stack.append(val)
            return "".join(stack)
        return modifyStr(s)==modifyStr(t)
            
        