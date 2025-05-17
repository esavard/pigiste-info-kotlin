# Pigiste.info

**Plateforme d’affichage de mandats TI au Québec, conçue pour les pigistes en TI et les donneurs d’ouvrage.**

Ce projet personnel vise à démontrer une architecture propre et maintenable, incluant les bonnes pratiques modernes de
développement logiciel : TDD, CI/CD, sécurité, base de données relationnelle, et intégration GraphQL.

---

## Fonctionnalités prévues (Minimal Viable Product)

- Création de comptes (pigistes et donneurs d’ouvrage)
- Association d’un utilisateur à une firme (optionnelle)
- Publication de mandats par les donneurs d'ouvrage
- Soumission de propositions par les pigistes
- Tableau de bord utilisateur
- Système d’authentification sécurisé (JWT)
- Recherche plein texte ou par mot-clé
- Intégration possible de notifications par courriel ou texto

---

## Technologies utilisées

| Composant       | Stack                        |
|-----------------|------------------------------|
| Backend         | Kotlin + Spring Boot 3       |
| Base de données | PostgreSQL (prod), H2 (dev)  |
| ORM             | Spring Data JPA              |
| API             | GraphQL (DGS)                |
| Frontend        | Mustache (SSR minimaliste)   |
| Tests unitaires | Kotest + MockK               |
| Tests intégrés  | Testcontainers (PostgreSQL)  |
| CI/CD           | GitHub Actions *(à venir)*   |

---

## Exécution locale

Prérequis : Java 21, Gradle, Docker (pour Testcontainers)

```bash
./gradlew bootRun
```

### Console H2

http://localhost:8080/h2-console

### Lancer les tests

```bash
./gradlew test
```

---

## TODO
* Implémentation des entités : User, Profile, Assignment, Proposal
* Résolveurs GraphQL
* Intégration de JWT
* Tableau de bord Mustache SSR
* Tests d’acceptation BDD
* Pipeline CI avec tests, build, couverture de code

---

## Auteur
Étienne Savard — développeur fullstack senior passionné par les pratiques modernes, la qualité logicielle et les
projets à impact local.

https://www.linkedin.com/in/esavard/

---

## Licence
Ce projet est un démonstrateur personnel afin de tester les bonnes pratiques en développement logiciel ainsi que
d'explorer de nouvelles technologies et outils.

Ce logiciel est publié sous licence AGPL v3, veuillez me contacter pour une utilisation commerciale.

[![License: AGPL v3](https://img.shields.io/badge/License-AGPL_v3-blue.svg)](https://www.gnu.org/licenses/agpl-3.0)

---