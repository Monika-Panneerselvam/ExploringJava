class Java8FAQ {
    public static void main(String[] args) {
        String input = "iloveexploringjava";
        Map<String, Long> map = Arrays.stream(input.split(regex:"")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}
