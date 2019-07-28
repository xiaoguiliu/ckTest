package day08.code.stream.create;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @ClassName Deom1
 * @Author 小鬼
 * @Date 2019/7/23 20:49
 * @Description
 * @Version V1.0
 **/
public class Deom1 {
        public static void main(String[] args) {
            // 1
            List<String> list = new ArrayList<>();
            Stream<String> stream = list.stream();

            Set<String> set = null;
            Stream<String> stream1 = set.stream();

            // 2
            int[] arr = new int[]{1, 2, 3};
            IntStream stream2 = Arrays.stream(arr);


            // 3
            // return Arrays.stream(values);
            Stream<String> sssss = Stream.of("", "", "");
        }



}
