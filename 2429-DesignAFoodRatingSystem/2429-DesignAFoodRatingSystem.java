// Last updated: 14/07/2026, 14:14:41
class FoodRatings {
     private Map<String, String> foodToCuisine;
    // food -> rating
    private Map<String, Integer> foodToRating;
    // cuisine -> max heap of foods
    private Map<String, PriorityQueue<Food>> cuisineToFoods;

    // Helper class for heap
    private static class Food {
        String name;
        int rating;

        Food(String name, int rating) {
            this.name = name;
            this.rating = rating;
        }
    }
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodToCuisine = new HashMap<>();
        foodToRating = new HashMap<>();
        cuisineToFoods = new HashMap<>();

        for (int i = 0; i < foods.length; i++) {
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];

            foodToCuisine.put(food, cuisine);
            foodToRating.put(food, rating);

            cuisineToFoods.putIfAbsent(cuisine, new PriorityQueue<>(
                (a, b) -> a.rating != b.rating ? b.rating - a.rating : a.name.compareTo(b.name)
            ));
            cuisineToFoods.get(cuisine).offer(new Food(food, rating));
        }

    }
    
    public void changeRating(String food, int newRating) {
        String cuisine = foodToCuisine.get(food);
        foodToRating.put(food, newRating); // update rating map
        cuisineToFoods.get(cuisine).offer(new Food(food, newRating)); // lazy insert
    }
    
    public String highestRated(String cuisine) {
        PriorityQueue<Food> pq = cuisineToFoods.get(cuisine);
        while (true) {
            Food top = pq.peek();
            // skip outdated entries
            if (foodToRating.get(top.name) != top.rating) {
                pq.poll();
            } else {
                return top.name;
            }
        }
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */