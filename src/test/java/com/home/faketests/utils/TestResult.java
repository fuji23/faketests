package com.home.faketests.utils;

/**
 * Created by Oleksandr_Danchenko on 21.09.2016.
 */
public class TestResult {
    private int runId = 100;
    private String testName;
    private String result;
    private String description;

    public int getRunId() {
        return runId;
    }

    public void setRunId(int runId) {
        this.runId = runId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
