## Pointer Meaning

- `i` → write pointer  
  Points to the position where the next unique element should be placed.
- `j` → read pointer  
  Scans the array to find new unique values.

---

## Initialization

- Start `i = 1` because:
  - The first element is always unique
  - It should remain at index `0`

---

## Algorithm Steps

1. Iterate through the array from index `1`
2. Compare the current element `nums[j]` with the last stored unique element `nums[i-1]`
3. If they are different:
   - Copy `nums[j]` to `nums[i]`
   - Increment `i`
4. If they are the same:
   - Skip the element
5. After the loop, the first `i` elements are uniqueStep-by-step

## memory diagram :
Input
nums = [1,1,2,2,3]

Initial state
i = 1

Index:  0 1 2 3 4
nums : [1 1 2 2 3]

j = 1
nums[1] == nums[0] → duplicate → skip

j = 2
nums[2] != nums[0]
nums[1] = 2
i = 2

[1 2 2 2 3]
     ↑

j = 3
nums[3] == nums[1] → duplicate → skip

j = 4
nums[4] != nums[1]
nums[2] = 3
i = 3

[1 2 3 2 3]

Final result
First 3 elements → [1,2,3]
return 3
