package com.driving;

public class Test {

    private int[] answers;
    private int ticketId;
    private int questionIndex;


    public Test(int ticketId) {
        this.questionIndex = 0;
        this.ticketId = ticketId;
        this.answers = new int[20];
    }

    public void setAnswer(int answer) {
        this.answers[questionIndex++] = answer;
    }

    public int getAnswerBy(int questionIndex) {
        if (questionIndex > answers.length) {
            return -1;
        }
        return answers[questionIndex];
    }

    public int getTicketId() {
        return this.ticketId;
    }
}
