#!/usr/bin/env bash
set -euo pipefail
REPO_URL="${REPO_URL:-git@github.com:YOUR_USERNAME/wireguard-vpn-starter.git}"
if [[ "$REPO_URL" == *"YOUR_USERNAME"* ]]; then
  echo "Set REPO_URL first"; exit 1; fi
git init
git branch -m main
git add .
git commit -m "init: wireguard vpn starter (Android)"
git remote add origin "$REPO_URL"
git push -u origin main
