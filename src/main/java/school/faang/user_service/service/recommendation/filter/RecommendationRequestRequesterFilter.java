package school.faang.user_service.service.recommendation.filter;

import org.springframework.stereotype.Component;
import school.faang.user_service.dto.recommendation.RecommendationRequestFilterDto;
import school.faang.user_service.entity.recommendation.RecommendationRequest;

import java.util.List;
import java.util.stream.Stream;

@Component
public class RecommendationRequestRequesterFilter implements RecommendationRequestFilter {
    @Override
    public boolean isApplicable(RecommendationRequestFilterDto requestFilterDto) {
        return requestFilterDto.getRequestIdPattern() != null;
    }

    @Override
    public List<RecommendationRequest> apply(Stream<RecommendationRequest> recommendationRequests, RecommendationRequestFilterDto requestFilterDto) {
        return recommendationRequests
                .filter(recommendationRequest ->
                        recommendationRequest.getRequester().getId().equals(requestFilterDto.getRequestIdPattern()))
                .toList();
    }
}
