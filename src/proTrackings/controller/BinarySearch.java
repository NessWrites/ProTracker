    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proTracker.controller;
import com.ProTracker.model.TrackerModel;
import java.util.ArrayList;

/**
 *
 * @author ness
 */
public class BinarySearch {
/**
 * Implements binary search for finding the index of an integer value in a sorted list.
 *
 * @param objectHolder      - the list of TrackerModel objects to be searched
 * @param low               - the low index for the search range
 * @param high              - the high index for the search range
 * @param searchKey         - the integer value to search for
 * @param positionHolder    - a list to hold the indices where the search key is found
 * @return the index where the search key is found, or -1 if not found
 */
    public int searchInt(ArrayList<TrackerModel> objectHolder, int low, int high, int searchKey, 
            ArrayList<Integer> positionHolder) {
        if (high >= low) {
            int mid = (low + high) / 2;

            // If the element is present at the middle itself
            if (objectHolder.get(mid).getsN() == searchKey) {
                // Add the current index to the holder
                positionHolder.add(mid);

                // Recursion: Continue searching in both subarrays
                searchInt(objectHolder, low, mid - 1, searchKey, positionHolder);
                searchInt(objectHolder, mid + 1, high, searchKey, positionHolder);
                return mid; // return the index where the match was found
            } else if (objectHolder.get(mid).getsN() > searchKey) {
                // If element is smaller than mid, search in the left subarray
                return searchInt(objectHolder, low, mid - 1, searchKey, positionHolder);
            } else {
                // If element is larger than mid, search in the right subarray
                return searchInt(objectHolder, mid + 1, high, searchKey, positionHolder);
            }
        }
        return -1; // return -1 if the element is not found
    }
    
/**
 * Implements binary search for finding the index of a string value in a sorted list.
 *
 * @param objectHolder      - the list of TrackerModel objects to be searched
 * @param low               - the low index for the search range
 * @param high              - the high index for the search range
 * @param searchKey         - the string value to search for
 * @param positionHolder    - a list to hold the indices where the search key is found
 * @param field             - the field to search for the string value (e.g., "Heros", "Difficulty")
 */
    public void searchString(ArrayList<TrackerModel> objectHolder, int low, int high, String searchKey, 
            ArrayList<Integer> positionHolder, String field) {
    if (high >= low) {
        int mid = (low + high) / 2;
        String midValue = "";

        // Get the value of the specified field
        switch(field) {
            case "Heros":
                midValue = objectHolder.get(mid).getHeros();
                break;
            case "Difficulty":
                midValue = objectHolder.get(mid).getDifficulty();
                break;
            case "Attack Type":
                midValue = objectHolder.get(mid).getAttackType();
                break;
            case "Position":
                midValue = objectHolder.get(mid).getPosition();
                break;
            // Add more cases as needed
        }

        // If the element is present at the middle itself
        if (midValue.equals(searchKey)) {
            // Add the current index to the holder
            positionHolder.add(mid);

            // Recursion: Continue searching in both subarrays
            searchString(objectHolder, low, mid - 1, searchKey, positionHolder, field);
            searchString(objectHolder, mid + 1, high, searchKey, positionHolder, field);
            
            
        } else if (midValue.compareTo(searchKey) > 0) {
            // If element is smaller than mid, search in the left subarray
            searchString(objectHolder, low, mid - 1, searchKey, positionHolder, field);
        } else {
            // If element is larger than mid, search in the right subarray
            searchString(objectHolder, mid + 1, high, searchKey, positionHolder, field);
        }
    }
    
}

}


