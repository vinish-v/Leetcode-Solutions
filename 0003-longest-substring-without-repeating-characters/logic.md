Example: s = "aba"

Indexes:

Index:  0   1   2
Char :  a   b   a

Initial state
left = 0
max_length = 0
char_set = {}


Window:

s[left : right+1] = ""

🔁 Iteration 1: right = 0
s[right] = 'a'

Check while condition
while 'a' in char_set:


'a' in {} → ❌ False

While loop does NOT run

Add character
char_set.add('a')


State:

char_set = {'a'}
left = 0
right = 0
window = "a"

Update max length
max_length = max(0, 0 - 0 + 1) = 1

🔁 Iteration 2: right = 1
s[right] = 'b'

Check while condition
'b' in {'a'} → ❌ False

Add character
char_set.add('b')


State:

char_set = {'a', 'b'}
left = 0
right = 1
window = "ab"

Update max length
max_length = max(1, 1 - 0 + 1) = 2

🔁 Iteration 3: right = 2
s[right] = 'a'

Check while condition
'a' in {'a', 'b'} → ✅ True


🚨 Duplicate detected → WHILE LOOP STARTS

🟡 While loop – First pass
char_set.remove(s[left])  # remove s[0] = 'a'
left += 1


State:

char_set = {'b'}
left = 1
right = 2
window = "b"

Check while condition again
'a' in {'b'} → ❌ False


➡️ While loop STOPS

✅ Safe to add current character
char_set.add('a')


State:

char_set = {'b', 'a'}
left = 1
right = 2
window = "ba"

Update max length
max_length = max(2, 2 - 1 + 1) = 2

🏁 End of loop

Final answer:

return 2
