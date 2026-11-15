.class public final Lcom/google/android/gms/internal/auth/P1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/auth/N1;


# static fields
.field public static final a:Lcom/google/android/gms/internal/auth/M;

.field public static final b:Lcom/google/android/gms/internal/auth/M;

.field public static final c:Lcom/google/android/gms/internal/auth/M;

.field public static final d:Lcom/google/android/gms/internal/auth/M;

.field public static final e:Lcom/google/android/gms/internal/auth/M;

.field public static final f:Lcom/google/android/gms/internal/auth/M;

.field public static final g:Lcom/google/android/gms/internal/auth/M;

.field public static final h:Lcom/google/android/gms/internal/auth/M;

.field public static final i:Lcom/google/android/gms/internal/auth/M;

.field public static final j:Lcom/google/android/gms/internal/auth/M;

.field public static final k:Lcom/google/android/gms/internal/auth/M;

.field public static final l:Lcom/google/android/gms/internal/auth/M;

.field public static final m:Lcom/google/android/gms/internal/auth/M;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/google/android/gms/internal/auth/I;

    const-string v1, "com.google.android.gms.auth_account"

    invoke-static {v1}, Lcom/google/android/gms/internal/auth/A;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/auth/I;-><init>(Landroid/net/Uri;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/auth/I;->b()Lcom/google/android/gms/internal/auth/I;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/auth/I;->a()Lcom/google/android/gms/internal/auth/I;

    move-result-object v0

    const-string v1, "getTokenRefactor__account_data_service_sample_percentage"

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/auth/I;->c(Ljava/lang/String;D)Lcom/google/android/gms/internal/auth/M;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/auth/P1;->a:Lcom/google/android/gms/internal/auth/M;

    const-string v1, "getTokenRefactor__account_data_service_tokenAPI_usable"

    const/4 v4, 0x1

    invoke-virtual {v0, v1, v4}, Lcom/google/android/gms/internal/auth/I;->e(Ljava/lang/String;Z)Lcom/google/android/gms/internal/auth/M;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/auth/P1;->b:Lcom/google/android/gms/internal/auth/M;

    const-string v1, "getTokenRefactor__account_manager_timeout_seconds"

    const-wide/16 v5, 0x14

    invoke-virtual {v0, v1, v5, v6}, Lcom/google/android/gms/internal/auth/I;->d(Ljava/lang/String;J)Lcom/google/android/gms/internal/auth/M;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/auth/P1;->c:Lcom/google/android/gms/internal/auth/M;

    const-string v1, "getTokenRefactor__android_id_shift"

    const-wide/16 v7, 0x0

    invoke-virtual {v0, v1, v7, v8}, Lcom/google/android/gms/internal/auth/I;->d(Ljava/lang/String;J)Lcom/google/android/gms/internal/auth/M;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/auth/P1;->d:Lcom/google/android/gms/internal/auth/M;

    :try_start_0
    const-string v1, "getTokenRefactor__blocked_packages"

    const-string v7, "ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n"

    const/4 v8, 0x3

    invoke-static {v7, v8}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v7

    invoke-static {v7}, Lcom/google/android/gms/internal/auth/I1;->q([B)Lcom/google/android/gms/internal/auth/I1;

    move-result-object v7

    sget-object v8, Lcom/google/android/gms/internal/auth/O1;->a:Lcom/google/android/gms/internal/auth/O1;

    invoke-virtual {v0, v1, v7, v8}, Lcom/google/android/gms/internal/auth/I;->f(Ljava/lang/String;Ljava/lang/Object;Lcom/google/android/gms/internal/auth/O1;)Lcom/google/android/gms/internal/auth/M;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/auth/P1;->e:Lcom/google/android/gms/internal/auth/M;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v1, "getTokenRefactor__chimera_get_token_evolved"

    invoke-virtual {v0, v1, v4}, Lcom/google/android/gms/internal/auth/I;->e(Ljava/lang/String;Z)Lcom/google/android/gms/internal/auth/M;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/auth/P1;->f:Lcom/google/android/gms/internal/auth/M;

    const-string v1, "getTokenRefactor__clear_token_timeout_seconds"

    invoke-virtual {v0, v1, v5, v6}, Lcom/google/android/gms/internal/auth/I;->d(Ljava/lang/String;J)Lcom/google/android/gms/internal/auth/M;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/auth/P1;->g:Lcom/google/android/gms/internal/auth/M;

    const-string v1, "getTokenRefactor__default_task_timeout_seconds"

    invoke-virtual {v0, v1, v5, v6}, Lcom/google/android/gms/internal/auth/I;->d(Ljava/lang/String;J)Lcom/google/android/gms/internal/auth/M;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/auth/P1;->h:Lcom/google/android/gms/internal/auth/M;

    const-string v1, "getTokenRefactor__gaul_accounts_api_evolved"

    const/4 v5, 0x0

    invoke-virtual {v0, v1, v5}, Lcom/google/android/gms/internal/auth/I;->e(Ljava/lang/String;Z)Lcom/google/android/gms/internal/auth/M;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/auth/P1;->i:Lcom/google/android/gms/internal/auth/M;

    const-string v1, "getTokenRefactor__gaul_token_api_evolved"

    invoke-virtual {v0, v1, v5}, Lcom/google/android/gms/internal/auth/I;->e(Ljava/lang/String;Z)Lcom/google/android/gms/internal/auth/M;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/auth/P1;->j:Lcom/google/android/gms/internal/auth/M;

    const-string v1, "getTokenRefactor__get_token_timeout_seconds"

    const-wide/16 v5, 0x78

    invoke-virtual {v0, v1, v5, v6}, Lcom/google/android/gms/internal/auth/I;->d(Ljava/lang/String;J)Lcom/google/android/gms/internal/auth/M;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/auth/P1;->k:Lcom/google/android/gms/internal/auth/M;

    const-string v1, "getTokenRefactor__gms_account_authenticator_evolved"

    invoke-virtual {v0, v1, v4}, Lcom/google/android/gms/internal/auth/I;->e(Ljava/lang/String;Z)Lcom/google/android/gms/internal/auth/M;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/auth/P1;->l:Lcom/google/android/gms/internal/auth/M;

    const-string v1, "getTokenRefactor__gms_account_authenticator_sample_percentage"

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/auth/I;->c(Ljava/lang/String;D)Lcom/google/android/gms/internal/auth/M;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/auth/P1;->m:Lcom/google/android/gms/internal/auth/M;

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/auth/I1;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/P1;->e:Lcom/google/android/gms/internal/auth/M;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/auth/M;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/auth/I1;

    return-object v0
.end method

.method public final zzc()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/auth/P1;->j:Lcom/google/android/gms/internal/auth/M;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/auth/M;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
