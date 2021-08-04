package lesson14_dz_testing;

import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Homework14Test {

    @MethodSource("testArr4")
    @ParameterizedTest
    void massArr14(int[] arr,int[] arr1){
        Assertions.assertArrayEquals(arr1,Homework14.arrAfter4(arr));

    }
    public static Stream<Arguments> testArr4 (){
        List <Arguments> test = new ArrayList<>();
        test.add(Arguments.arguments(new int[] {9,8,7,6,5,4,3,2,1,0}, new int[]{3,2,1,0}));
        test.add(Arguments.arguments(new int[] {9,8,7,6,5,3,3,2,1,0}, new int[]{3,2,1,0}));
        return test.stream();
    }

    @org.junit.jupiter.api.Test
    void arrAfter4() {

    }
//    @CsvSource({
//            "1,1,4,4,1,1,4,4",
//            "1,1,1,1,1",
//            "1,4,1,3,1",
//    })
//    @ParameterizedTest
//    void massArr14(int[] arr){
//        Assertions.assertTrue(Homework14.arr14(arr));
//    }
    @org.junit.jupiter.api.Test
    void arr14() {
        Assertions.assertTrue(Homework14.arr14(new int[]{1,1,1,4,4,1,4,4}));
//        Assertions.assertTrue(Homework14.arr14(new int[]{1,1,1,1,1,1}));

    }
    @org.junit.jupiter.api.Test
    void Barr14() {
//        Assertions.assertTrue(Homework14.arr14(new int[]{1,1,1,4,4,1,4,4}));
        Assertions.assertTrue(Homework14.arr14(new int[]{1,1,1,1,1,1}));

    }
}
