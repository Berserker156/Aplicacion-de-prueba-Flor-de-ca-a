package com.sis.aplicacion_conversor.Database;

public class Task extends RealmObject {
    @PrimaryKey private String name;
    @Required private String status = TaskStatus.Open.name();
    public void setStatus(TaskStatus status) { this.status = status.name(); }
    public String getStatus() { return this.status; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Task(String _name) { this.name = _name; }
    public Task() {}
}