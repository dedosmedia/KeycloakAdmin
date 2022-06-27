# Práctico: Administración de usuarios en Keycloak mediante su API

### 
Ejemplo de como administrar los usuarios de un realm en Keycloak mediante llamadas a su API.
Se usa la dependencia de keycloak-admin-client para abstraer las llamadas al API.
En Keucloak se creó un Client con grant_type de CLIENT_CREDENTIALS y  se hablitó en la parte de Service Account Roles, un Client Role de realm-management con los roles necesarios para acceder a la visualización de usuarios. (view-users)
