.class public Lcom/google/android/gms/common/PackageSignatureVerifier;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation build Lcom/google/android/gms/common/internal/ShowFirstParty;
.end annotation

.annotation runtime Lcom/google/errorprone/annotations/RestrictedInheritance;
    allowedOnPath = ".*javatests.*/com/google/android/gms/common/.*"
    explanation = "Sub classing of GMS Core\'s APIs are restricted to testing fakes."
    link = "go/gmscore-restrictedinheritance"
.end annotation


# static fields
.field static volatile zza:Lcom/google/android/gms/common/e;

.field private static zzb:Lcom/google/android/gms/common/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static zza(Landroid/content/Context;)Lcom/google/android/gms/common/f;
    .locals 2

    const-class v0, Lcom/google/android/gms/common/PackageSignatureVerifier;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/common/PackageSignatureVerifier;->zzb:Lcom/google/android/gms/common/f;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/common/f;

    invoke-direct {v1, p0}, Lcom/google/android/gms/common/f;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/google/android/gms/common/PackageSignatureVerifier;->zzb:Lcom/google/android/gms/common/f;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p0, Lcom/google/android/gms/common/PackageSignatureVerifier;->zzb:Lcom/google/android/gms/common/f;

    monitor-exit v0

    return-object p0

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public queryPackageSignatureVerified(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/common/PackageVerificationResult;
    .locals 3
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    .annotation build Lcom/google/android/gms/common/internal/ShowFirstParty;
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/GooglePlayServicesUtilLight;->honorsDebugCertificates(Landroid/content/Context;)Z

    move-result v0

    invoke-static {p1}, Lcom/google/android/gms/common/PackageSignatureVerifier;->zza(Landroid/content/Context;)Lcom/google/android/gms/common/f;

    invoke-static {}, Lcom/google/android/gms/common/o;->f()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    if-eq v1, v0, :cond_0

    const-string v1, "-0"

    goto :goto_0

    :cond_0
    const-string v1, "-1"

    :goto_0
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/common/PackageSignatureVerifier;->zza:Lcom/google/android/gms/common/e;

    if-eqz v2, :cond_1

    sget-object v2, Lcom/google/android/gms/common/PackageSignatureVerifier;->zza:Lcom/google/android/gms/common/e;

    invoke-static {v2}, Lcom/google/android/gms/common/e;->b(Lcom/google/android/gms/common/e;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    :goto_1
    sget-object p1, Lcom/google/android/gms/common/PackageSignatureVerifier;->zza:Lcom/google/android/gms/common/e;

    invoke-static {p1}, Lcom/google/android/gms/common/e;->a(Lcom/google/android/gms/common/e;)Lcom/google/android/gms/common/PackageVerificationResult;

    move-result-object p1

    goto :goto_2

    :cond_1
    invoke-static {p1}, Lcom/google/android/gms/common/PackageSignatureVerifier;->zza(Landroid/content/Context;)Lcom/google/android/gms/common/f;

    const/4 p1, 0x0

    invoke-static {p2, v0, p1, p1}, Lcom/google/android/gms/common/o;->c(Ljava/lang/String;ZZZ)Lcom/google/android/gms/common/q;

    move-result-object p1

    iget-boolean v0, p1, Lcom/google/android/gms/common/q;->a:Z

    if-eqz v0, :cond_2

    iget p1, p1, Lcom/google/android/gms/common/q;->d:I

    new-instance v0, Lcom/google/android/gms/common/e;

    invoke-static {p2, p1}, Lcom/google/android/gms/common/PackageVerificationResult;->zzd(Ljava/lang/String;I)Lcom/google/android/gms/common/PackageVerificationResult;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/common/e;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/PackageVerificationResult;)V

    sput-object v0, Lcom/google/android/gms/common/PackageSignatureVerifier;->zza:Lcom/google/android/gms/common/e;

    goto :goto_1

    :cond_2
    iget-object v0, p1, Lcom/google/android/gms/common/q;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/common/q;->b:Ljava/lang/String;

    iget-object p1, p1, Lcom/google/android/gms/common/q;->c:Ljava/lang/Throwable;

    invoke-static {p2, v0, p1}, Lcom/google/android/gms/common/PackageVerificationResult;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/common/PackageVerificationResult;

    move-result-object p1

    :goto_2
    return-object p1

    :cond_3
    new-instance p1, Lcom/google/android/gms/common/zzae;

    invoke-direct {p1}, Lcom/google/android/gms/common/zzae;-><init>()V

    throw p1
.end method

.method public queryPackageSignatureVerifiedWithRetry(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/common/PackageVerificationResult;
    .locals 2
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    .annotation build Lcom/google/android/gms/common/internal/ShowFirstParty;
    .end annotation

    :try_start_0
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/common/PackageSignatureVerifier;->queryPackageSignatureVerified(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/common/PackageVerificationResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/PackageVerificationResult;->zzb()V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/common/PackageSignatureVerifier;->queryPackageSignatureVerified(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/common/PackageVerificationResult;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/common/PackageVerificationResult;->zzc()Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "PkgSignatureVerifier"

    const-string v1, "Got flaky result during package signature verification"

    invoke-static {p2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object p1

    :cond_0
    move-object v0, p1

    :goto_0
    return-object v0
.end method
