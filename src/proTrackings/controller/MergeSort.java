/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proTracker.controller;
import com.ProTracker.model.TrackerModel;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Nischhal Shreshta
 * np01ai4s230009@islingtoncollege.edu.np
 * Islington College,  Kamal Marg
 * 
 */


    public class MergeSort {

     /**
     * Implements the merge sort algorithm for sorting a list of TrackerModel objects.
     *
     * @param list        - the list of TrackerModel objects to be sorted
     * @param comparator  - the comparator for defining the sorting order
     * @return a sorted list of TrackerModel objects
     */
            public ArrayList<TrackerModel> mergeSort(ArrayList<TrackerModel> list, 
                    Comparator<TrackerModel> comparator) {
            if (list.size() <= 1) {
                return list;
            }

            int middle = list.size() / 2;
            ArrayList<TrackerModel> left = new ArrayList<>(list.subList(0, middle));
            ArrayList<TrackerModel> right = new ArrayList<>
            (list.subList(middle, list.size()));

            left = mergeSort(left, comparator);
            right = mergeSort(right, comparator);

            return merge(left, right, comparator);
        }
    /**
     * Merges two sorted lists into a single sorted list.
     *
     * @param left        - the left sorted list
     * @param right       - the right sorted list
     * @param comparator  - the comparator for defining the sorting order
     * @return a single sorted list containing all elements from left and right
     */
        private ArrayList<TrackerModel> merge(ArrayList<TrackerModel> left, ArrayList<TrackerModel> 
                right, Comparator<TrackerModel> comparator) {
            ArrayList<TrackerModel> result = new ArrayList<>();
            int leftIndex = 0, rightIndex = 0;

            while (leftIndex < left.size() && rightIndex < right.size()) {
                if (comparator.compare(left.get(leftIndex), right.get(rightIndex)) < 0) {
                    result.add(left.get(leftIndex));
                    leftIndex++;
                } else {
                    result.add(right.get(rightIndex));
                    rightIndex++;
                }
            }

            result.addAll(left.subList(leftIndex, left.size()));
            result.addAll(right.subList(rightIndex, right.size()));

            return result;
        }
    }