package Prototype;

public class Project implements Copyable {
    private double version;
    private String projectName;
    private String sourceCode;

    public Project(double version, String projectName, String sourceCode) {
        this.version = version;
        this.projectName = projectName;
        this.sourceCode = sourceCode;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    @Override
    public Object copy() {
        Project copy = new Project(this.version, this.projectName, this.sourceCode);
        return copy;
    }

    @Override
    public String toString() {
        return "Project{" +
                "version=" + version +
                ", projectName='" + projectName + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }
}
