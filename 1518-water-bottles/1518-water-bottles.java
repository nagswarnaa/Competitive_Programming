class Solution {
    int bottlesdrunk,empty=0;
    public int numWaterBottles(int numBottles, int numExchange) {
        bottlesdrunk=numBottles;
        while(numBottles>=numExchange){           
          empty= numBottles%numExchange;  
          numBottles=numBottles/numExchange;          
          bottlesdrunk+=numBottles;
          numBottles+=empty;   
        }
        return bottlesdrunk;
    }
}