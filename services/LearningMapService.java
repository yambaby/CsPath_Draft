package services;

import java.util.ArrayList;
import java.util.HashSet;

import models.MatchResult;
import models.Roadmap;

import repositories.RoadmapRepository;

public class LearningMapService {
    public static Roadmap recommendCareerRoadmap(MatchResult matchResult){
        int id = matchResult.getInternship().getId();
        return RoadmapRepository.getCareerRoadmap(id);
    }

    public static ArrayList<Roadmap> recommendSkillRoadmaps(MatchResult matchResult){
        ArrayList<String> missingSkills = matchResult.getMissingSkills();
        ArrayList<Roadmap> recommendedRoadmaps = new ArrayList<>();
        HashSet<String> addedUrls = new HashSet<>();

        for (String missingSkill : missingSkills){
            Roadmap roadmap = RoadmapRepository.getSkillRoadMap(missingSkill);

            if (roadmap != null){
                if (!addedUrls.contains(roadmap.getUrl())){
                    recommendedRoadmaps.add(roadmap);
                    addedUrls.add(roadmap.getUrl());
                }
            }
        }

        return recommendedRoadmaps;
    }
}

