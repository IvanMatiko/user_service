package school.faang.user_service.service.user.filter;

import org.springframework.stereotype.Component;
import school.faang.user_service.dto.user.UserFilterDto;
import school.faang.user_service.entity.User;

import java.util.stream.Stream;

@Component
public class UserNameFilter implements UserFilter {

    @Override
    public boolean isApplicable(UserFilterDto filter) {
        return filter.getNamePattern() != null;
    }

    @Override
    public Stream<User> apply(Stream<User> users, UserFilterDto filter) {
        return users.filter(user -> user.getUsername().contains(filter.getNamePattern()));
    }
}
