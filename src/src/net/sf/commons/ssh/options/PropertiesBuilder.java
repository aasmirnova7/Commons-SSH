package net.sf.commons.ssh.options;

public abstract class PropertiesBuilder
{
    protected ConfigurableProperties options;

    public PropertiesBuilder(ConfigurableProperties options)
    {
        this.options = options;
        setupDefault();
    }

    protected void setupDefault()
    {

    }

    public ConfigurableProperties getProperties()
    {
        return options;
    }

    public void verify() throws IllegalPropertyException
    {

    }
}
