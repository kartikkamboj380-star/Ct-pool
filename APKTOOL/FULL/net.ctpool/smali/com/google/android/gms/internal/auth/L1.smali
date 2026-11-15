.class public final Lcom/google/android/gms/internal/auth/L1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/auth/K1;


# static fields
.field public static final a:Lcom/google/android/gms/internal/auth/M;

.field public static final b:Lcom/google/android/gms/internal/auth/M;

.field public static final c:Lcom/google/android/gms/internal/auth/M;

.field public static final d:Lcom/google/android/gms/internal/auth/M;

.field public static final e:Lcom/google/android/gms/internal/auth/M;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/auth/I;

    const-string v1, "com.google.android.gms.auth_account"

    invoke-static {v1}, Lcom/google/android/gms/internal/auth/A;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/auth/I;-><init>(Landroid/net/Uri;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/auth/I;->b()Lcom/google/android/gms/internal/auth/I;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/auth/I;->a()Lcom/google/android/gms/internal/auth/I;

    move-result-object v0

    const-string v1, "Aang__create_auth_exception_with_pending_intent"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/auth/I;->e(Ljava/lang/String;Z)Lcom/google/android/gms/internal/auth/M;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/auth/L1;->a:Lcom/google/android/gms/internal/auth/M;

    const-string v1, "Aang__enable_add_account_restrictions"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/auth/I;->e(Ljava/lang/String;Z)Lcom/google/android/gms/internal/auth/M;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/auth/L1;->b:Lcom/google/android/gms/internal/auth/M;

    const-string v1, "Aang__log_missing_gaia_id_event"

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/auth/I;->e(Ljava/lang/String;Z)Lcom/google/android/gms/internal/auth/M;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/auth/L1;->c:Lcom/google/android/gms/internal/auth/M;

    const-string v1, "Aang__log_obfuscated_gaiaid_status"

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/auth/I;->e(Ljava/lang/String;Z)Lcom/google/android/gms/internal/auth/M;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/auth/L1;->d:Lcom/google/android/gms/internal/auth/M;

    const-string v1, "Aang__switch_clear_token_to_aang"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/auth/I;->e(Ljava/lang/String;Z)Lcom/google/android/gms/internal/auth/M;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/auth/L1;->e:Lcom/google/android/gms/internal/auth/M;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/L1;->a:Lcom/google/android/gms/internal/auth/M;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/auth/M;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
