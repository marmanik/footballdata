package org.football.domain;

/**
 * Created by nmarmaridis on 06-Feb-17.
 */
public class Player {

    private String  name;
    private String  position;
    private Integer  jerseyNumber;
    private String  dateOfBirth;
    private String  nationality;
    private String  contractUntil;
    private String  marketValue;
    private Long teamId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(Integer jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getContractUntil() {
        return contractUntil;
    }

    public void setContractUntil(String contractUntil) {
        this.contractUntil = contractUntil;
    }

    public String getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(String marketValue) {
        this.marketValue = marketValue;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }
}
