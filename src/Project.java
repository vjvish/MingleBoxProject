

class Project {
	  int id=1;
    String projectName;
    String description;
 
     static int c=1;
    int pricePrediction;
    public Project()
    {
        
    }
    public Project(int i ,String projectName, String description, int pricePrediction) {
        this.projectName = projectName;
        this.description = description;
        this.id=i;
        this.pricePrediction = pricePrediction;
        c++;
        
    }
    
    @Override
	public String toString() {
		return "Project [id=" + id + ", projectName=" + projectName + ", description=" + description
				+ ", pricePrediction=" + pricePrediction + "]";
	}
	public double getPricePrediction() {
        return pricePrediction;
    }

    // Other methods: Project details, etc.
}
