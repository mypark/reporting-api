package com.triplelift.reportingapi.models;

import com.yahoo.elide.annotation.Include;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Include(rootLevel = true, type = "group")
@Entity
public class ArtifactGroup {
    @Id
    public String name = "";

    public String commonName = "";

    public String description = "";

    @OneToMany(mappedBy = "group")
    public List<ArtifactProduct> products = new ArrayList<>();
}