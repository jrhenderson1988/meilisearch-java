package com.meilisearch.sdk.model;

import lombok.Getter;

/**
 * Data structure of Meilisearch response for tasks Results
 *
 * @see <a href="https://www.meilisearch.com/docs/reference/api/tasks#response">API
 *     specification</a>
 */
@Getter
public class TasksResults {
    protected Task[] results = null;
    protected int limit;
    protected int from;
    protected int next;
    protected int total;

    public TasksResults() {}
}
