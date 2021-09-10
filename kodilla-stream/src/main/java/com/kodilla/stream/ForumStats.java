package com.kodilla.stream;

public class ForumStats {

    public static void main(String[] args) {
        double avgAboveFourty = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > 40)
                .map(postQuantity -> postQuantity.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avgAboveFourty);


        double avgBelowFourty = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() < 40)
                .map(postQuantity -> postQuantity.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avgBelowFourty);
    }

}
