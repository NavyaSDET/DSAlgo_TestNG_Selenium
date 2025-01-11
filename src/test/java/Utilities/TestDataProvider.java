package Utilities;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

    @DataProvider(name = "pythonCodeRow0")
    public Object[][] provideCodeData_0() {
        return new Object[][] {
            {"pythonCode", 0},
        };
    }
    
    @DataProvider(name = "pythonCodeRow1")
    public Object[][] provideCodeData_1() {
        return new Object[][] {
            {"pythonCode", 1},
        };
    }
    
    @DataProvider(name = "pythonCodeRow2")
    public Object[][] provideCodeData_2() {
        return new Object[][] {
            {"pythonCode", 2},
        };
    }
    
    @DataProvider(name = "pythonCodeRow3")
    public Object[][] provideCodeData_3() {
        return new Object[][] {
            {"pythonCode", 3},
        };
    }
    
    @DataProvider(name = "pythonCodeRow4")
    public Object[][] provideCodeData_4() {
        return new Object[][] {
            {"pythonCode", 4},
        };
    }
    
    @DataProvider(name = "pythonCodeRow5")
    public Object[][] provideCodeData_5() {
        return new Object[][] {
            {"pythonCode", 4},
        };
    }
    
    @DataProvider(name = "pythonCodeRow6")
    public Object[][] provideCodeData_6() {
        return new Object[][] {
            {"pythonCode", 6},
        };
    }
    
    @DataProvider(name = "pythonCodeRow7")
    public Object[][] provideCodeData_7() {
        return new Object[][] {
            {"pythonCode", 7},
        };
    }
    
    @DataProvider(name = "loginRow0")
    public Object[][] loginData_0() {
        return new Object[][] {
            {"login", 0},
        };
    }
    
    @DataProvider(name = "loginRow1")
    public Object[][] loginData_1() {
        return new Object[][] {
            {"login", 1},
        };
    }
    
    @DataProvider(name = "loginRow2")
    public Object[][] loginData_2() {
        return new Object[][] {
            {"login", 2},
        };
    }
    
    @DataProvider(name = "loginRow3")
    public Object[][] loginData_3() {
        return new Object[][] {
            {"login", 3},
        };
    }
    
    @DataProvider(name = "loginRow4")
    public Object[][] loginData_4() {
        return new Object[][] {
            {"login", 4},
        };
    }
    
    @DataProvider(name = "loginRow5")
    public Object[][] loginData_5() {
        return new Object[][] {
            {"login", 5},
        };
    }
    
    @DataProvider(name = "RegisterRow1")
    public Object[][] RegisterData_1() {
        return new Object[][] {
            {"Register", 1},
        };
    }
    
    @DataProvider(name = "RegisterRow2")
    public Object[][] RegisterData_2() {
        return new Object[][] {
            {"Register", 2},
        };
    }
    
    @DataProvider(name = "RegisterRow3")
    public Object[][] RegisterData_3() {
        return new Object[][] {
            {"Register", 3},
        };
    }
    
    @DataProvider(name = "RegisterRow4")
    public Object[][] RegisterData_4() {
        return new Object[][] {
            {"Register", 4},
        };
    }
    
    @DataProvider(name = "RegisterRow5")
    public Object[][] RegisterData_5() {
        return new Object[][] {
            {"Register", 5},
        };
    }
    
    @DataProvider(name = "RegisterRow6")
    public Object[][] RegisterData_6() {
        return new Object[][] {
            {"Register", 6},
        };
    }
    
    @DataProvider(name = "RegisterRow7")
    public Object[][] RegisterData_7() {
        return new Object[][] {
            {"Register", 7},
        };
    }
    
    @DataProvider(name = "RegisterRow8")
    public Object[][] RegisterData_8() {
        return new Object[][] {
            {"Register", 8},
        };
    }
    
    @DataProvider(name="arrayValidcodeTopics")
	public Object[][] arrayValidcodeTopics() {
		return new Object[][] {
			{0,"print'Hello'"},
			{1,"print'Hello'"},
			{2,"print'Hello'"},
			{3,"print'Hello'"}
		};
	}
    
	@DataProvider(name="arrayInValidcodeTopics")
	public Object[][] arrayInValidcodeTopics() {
		return new Object[][] {
			{0,"ABC"},
			{1,"ABC"},
			{2,"ABC"},
			{3,"ABC"}
		};
	}

    @DataProvider(name="graphValidcodeTopics")
	public Object[][] graphValidcodeTopics() {
		return new Object[][] {
			{0,"print'Hello'"},
			{1,"print'Hello'"}
		};
	}
    
	@DataProvider(name="graphInValidcodeTopics")
	public Object[][] graphInValidcodeTopics() {
		return new Object[][] {
			{0,"ABC"},
			{1,"ABC"}	
		};
	}

    @DataProvider(name="llValidcodeTopics")
	public Object[][] llValidcodeTopics() {
		return new Object[][] {
			{0,"print'Hello'"},
			{1,"print'Hello'"},
			{2,"print'Hello'"},
			{3,"print'Hello'"},
			{4,"print'Hello'"},
			{5,"print'Hello'"},
			{6,"print'Hello'"}
		};
	}
    
	@DataProvider(name="llInValidcodeTopics")
	public Object[][] llInValidcodeTopics() {
		return new Object[][] {
			{0,"ABC"},
			{1,"ABC"},
			{2,"ABC"},
			{3,"ABC"},
			{4,"ABC"},
			{5,"ABC"},
			{6,"ABC"}
		};
	}

    @DataProvider(name="queueValidcodeTopics")
	public Object[][] queueValidcodeTopics() {
		return new Object[][] {
			{0,"print'Hello'"},
			{1,"print'Hello'"},
			{2,"print'Hello'"},
			{3,"print'Hello'"}
		};
	}
    
	@DataProvider(name="queueInValidcodeTopics")
	public Object[][] queueInValidcodeTopics() {
		return new Object[][] {
			{0,"ABC"},
			{1,"ABC"},
			{2,"ABC"},
			{3,"ABC"}
		};
	}

    @DataProvider(name="stackValidcodeTopics")
	public Object[][] stackValidcodeTopics() {
		return new Object[][] {
			{0,"print'Hello'"},
			{1,"print'Hello'"},
			{2,"print'Hello'"}
		};
	}
    
	@DataProvider(name="stackInValidcodeTopics")
	public Object[][] InValidcodeTopics() {
		return new Object[][] {
			{0,"ABC"},
			{1,"ABC"},
			{2,"ABC"}
		};
	}

    @DataProvider(name="treeValidcodeTopics")
	public Object[][] treeValidcodeTopics() {
		return new Object[][] {
			{0,"print'Hello'"},
			{1,"print'Hello'"},
			{2,"print'Hello'"},
			{3,"print'Hello'"},
			{4,"print'Hello'"},
			{5,"print'Hello'"},
			{6,"print'Hello'"},
			{7,"print'Hello'"},
			{8,"print'Hello'"},
			{9,"print'Hello'"},
			{10,"print'Hello'"},
			{11,"print'Hello'"},
			{12,"print'Hello'"}	
		};
	}
    
	@DataProvider(name="treeInValidcodeTopics")
	public Object[][] treeInValidcodeTopics() {
		return new Object[][] {
			{0,"ABC"},
			{1,"ABC"},
			{2,"ABC"},
			{3,"ABC"},
			{4,"ABC"},
			{5,"ABC"},
			{6,"ABC"},
			{7,"ABC"},
			{8,"ABC"},
			{9,"ABC"},
			{10,"ABC"},
			{11,"ABC"},
			{12,"ABC"}	
		};
	}

}
