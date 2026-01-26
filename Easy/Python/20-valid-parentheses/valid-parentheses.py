class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        
        # Create a mapping from each closing bracket to its corresponding opening bracket. This helps us quickly check if a closing bracket matches the last opened one.
        bracket_map = {')': '(', ']': '[', '}': '{'}

        #Initialize an empty stack to keep track of open brackets. We will push opening brackets onto it and pop them when we find a matching closing bracket.
        stack = []

        # Iterate through each character in String s
        for char in s:
            # If the character is an opening bracket, push it onto the stack
            if char in bracket_map.values():
                stack.append(char)
            elif char in bracket_map:
                # If the stack is empty (no opening bracket to match) OR the last opening bracket doesn't match the closing bracket, return False
                if not stack or stack[-1] != bracket_map[char]:
                    return False
                stack.pop()
            else:
                # Return false for any invalid characters
                return False
        
        # After processing all characters: if the stack is empty, all brackets were matched correctly. Therefore, it is a valid string. If the stack is not empty, there are unmatched opening brackets. It is an invalid string
        return len(stack)==0
