package hydra

/**
 * This class defines all events produced or consumer by this module to avoid
 * typos
 *
 * @since 0.1.0
 */
class Events {

  /**
   * Event produced when a deployment has been triggered by a Github
   * webhook
   *
   * @since 0.1.0
   */
  static final String GITHUB_DEPLOYMENT = "event.deployment.github.requested"

}
