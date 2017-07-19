package hydra

import groovy.util.logging.Slf4j
import javax.inject.Inject
import com.github.dockerjava.api.DockerClient
import pluto.events.Publisher

/**
 * Service responsible to hold the logic on how to deploy projects on
 * Docker following the specs of a given template
 *
 * @since 0.1.0
 */
@Slf4j
class Service {

  /**
   * Instance to deal with Docker instance
   *
   * @since 0.1.0
   */
  @Inject
  DockerClient dockerClient

  /**
   * Worker specific configuration
   *
   * @since 0.1.0
   */
  @Inject
  Config config

  /**
   * Pluto's configured publisher
   *
   * @since 0.1.0
   */
  @Inject
  Publisher publisher

  /**
   * Builds a template's Docker image
   *
   * @since 0.1.0
   */
  void deploy(Map json) {
    publisher.publish("event.deployment.github.deployed", json.payload as Serializable)
  }

  /**
   * Deletes a template's Docker image
   *
   * @since 0.1.0
   */
  void updateModule(Map json) {
    publisher.publish("event.deployment.github.updated", json.payload as Serializable)
  }
}
