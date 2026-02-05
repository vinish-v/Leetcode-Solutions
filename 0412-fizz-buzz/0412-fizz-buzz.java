class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> newArr = new ArrayList<>();
     
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                newArr.add("FizzBuzz");
            }
            else if (i%3==0){
                newArr.add("Fizz");
            }
            else if(i%5 ==0){
                newArr.add("Buzz");
            }
            else{
                newArr.add(String.valueOf(i));
            }
        }
        return newArr;
    }
}