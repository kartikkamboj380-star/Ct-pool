.class public Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;
.super Lcom/google/android/gms/internal/measurement/S0;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/util/DynamiteApi;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService$a;,
        Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService$b;
    }
.end annotation


# instance fields
.field a:Lcom/google/android/gms/measurement/internal/S2;

.field private final b:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/S0;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    new-instance v0, Ln/a;

    invoke-direct {v0}, Ln/a;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Ljava/util/Map;

    return-void
.end method

.method private final j0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Attempting to perform action before initialize."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final k0(Lcom/google/android/gms/internal/measurement/U0;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->J()Lcom/google/android/gms/measurement/internal/d6;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/measurement/internal/d6;->Q(Lcom/google/android/gms/internal/measurement/U0;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public beginAdUnitExposure(Ljava/lang/String;J)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->w()Lcom/google/android/gms/measurement/internal/y;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/measurement/internal/y;->x(Ljava/lang/String;J)V

    return-void
.end method

.method public clearConditionalUserProperty(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/measurement/internal/F3;->d0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public clearMeasurementEnabled(J)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/google/android/gms/measurement/internal/F3;->X(Ljava/lang/Boolean;)V

    return-void
.end method

.method public endAdUnitExposure(Ljava/lang/String;J)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->w()Lcom/google/android/gms/measurement/internal/y;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/measurement/internal/y;->B(Ljava/lang/String;J)V

    return-void
.end method

.method public generateEventId(Lcom/google/android/gms/internal/measurement/U0;)V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->J()Lcom/google/android/gms/measurement/internal/d6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/d6;->P0()J

    move-result-wide v0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/S2;->J()Lcom/google/android/gms/measurement/internal/d6;

    move-result-object v2

    invoke-virtual {v2, p1, v0, v1}, Lcom/google/android/gms/measurement/internal/d6;->O(Lcom/google/android/gms/internal/measurement/U0;J)V

    return-void
.end method

.method public getAppInstanceId(Lcom/google/android/gms/internal/measurement/U0;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->f()Lcom/google/android/gms/measurement/internal/P2;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/measurement/internal/U2;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/measurement/internal/U2;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/U0;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/P2;->B(Ljava/lang/Runnable;)V

    return-void
.end method

.method public getCachedAppInstanceId(Lcom/google/android/gms/internal/measurement/U0;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/F3;->t0()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->k0(Lcom/google/android/gms/internal/measurement/U0;Ljava/lang/String;)V

    return-void
.end method

.method public getConditionalUserProperties(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/U0;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->f()Lcom/google/android/gms/measurement/internal/P2;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/measurement/internal/o4;

    invoke-direct {v1, p0, p3, p1, p2}, Lcom/google/android/gms/measurement/internal/o4;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/U0;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/P2;->B(Ljava/lang/Runnable;)V

    return-void
.end method

.method public getCurrentScreenClass(Lcom/google/android/gms/internal/measurement/U0;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/F3;->u0()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->k0(Lcom/google/android/gms/internal/measurement/U0;Ljava/lang/String;)V

    return-void
.end method

.method public getCurrentScreenName(Lcom/google/android/gms/internal/measurement/U0;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/F3;->v0()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->k0(Lcom/google/android/gms/internal/measurement/U0;Ljava/lang/String;)V

    return-void
.end method

.method public getGmpAppId(Lcom/google/android/gms/internal/measurement/U0;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/F3;->w0()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->k0(Lcom/google/android/gms/internal/measurement/U0;Ljava/lang/String;)V

    return-void
.end method

.method public getMaxUserProperties(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/U0;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/F3;->C(Ljava/lang/String;)I

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/S2;->J()Lcom/google/android/gms/measurement/internal/d6;

    move-result-object p1

    const/16 v0, 0x19

    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/measurement/internal/d6;->N(Lcom/google/android/gms/internal/measurement/U0;I)V

    return-void
.end method

.method public getSessionId(Lcom/google/android/gms/internal/measurement/U0;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/internal/F3;->N(Lcom/google/android/gms/internal/measurement/U0;)V

    return-void
.end method

.method public getTestFlag(Lcom/google/android/gms/internal/measurement/U0;I)V
    .locals 4

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    if-eqz p2, :cond_4

    const/4 v0, 0x1

    if-eq p2, v0, :cond_3

    const/4 v0, 0x2

    if-eq p2, v0, :cond_2

    const/4 v0, 0x3

    if-eq p2, v0, :cond_1

    const/4 v0, 0x4

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/S2;->J()Lcom/google/android/gms/measurement/internal/d6;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/F3;->p0()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/measurement/internal/d6;->S(Lcom/google/android/gms/internal/measurement/U0;Z)V

    :goto_0
    return-void

    :cond_1
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/S2;->J()Lcom/google/android/gms/measurement/internal/d6;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/F3;->r0()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/measurement/internal/d6;->N(Lcom/google/android/gms/internal/measurement/U0;I)V

    return-void

    :cond_2
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/S2;->J()Lcom/google/android/gms/measurement/internal/d6;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/F3;->q0()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "r"

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    :try_start_0
    invoke-interface {p1, v2}, Lcom/google/android/gms/internal/measurement/U0;->b(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p2, Lcom/google/android/gms/measurement/internal/w3;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/S2;->d()Lcom/google/android/gms/measurement/internal/n2;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/n2;->J()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object p2

    const-string v0, "Error returning double value to wrapper"

    invoke-virtual {p2, v0, p1}, Lcom/google/android/gms/measurement/internal/p2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_3
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/S2;->J()Lcom/google/android/gms/measurement/internal/d6;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/F3;->s0()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p2, p1, v0, v1}, Lcom/google/android/gms/measurement/internal/d6;->O(Lcom/google/android/gms/internal/measurement/U0;J)V

    return-void

    :cond_4
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/S2;->J()Lcom/google/android/gms/measurement/internal/d6;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/F3;->x0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/measurement/internal/d6;->Q(Lcom/google/android/gms/internal/measurement/U0;Ljava/lang/String;)V

    return-void
.end method

.method public getUserProperties(Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/internal/measurement/U0;)V
    .locals 8

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->f()Lcom/google/android/gms/measurement/internal/P2;

    move-result-object v0

    new-instance v7, Lcom/google/android/gms/measurement/internal/v3;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p4

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/measurement/internal/v3;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/U0;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v0, v7}, Lcom/google/android/gms/measurement/internal/P2;->B(Ljava/lang/Runnable;)V

    return-void
.end method

.method public initForTests(Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    return-void
.end method

.method public initialize(Lcom/google/android/gms/dynamic/a;Lcom/google/android/gms/internal/measurement/c1;J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    if-nez v0, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/dynamic/b;->j0(Lcom/google/android/gms/dynamic/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/measurement/internal/S2;->b(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/c1;Ljava/lang/Long;)Lcom/google/android/gms/measurement/internal/S2;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->d()Lcom/google/android/gms/measurement/internal/n2;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/n2;->J()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object p1

    const-string p2, "Attempting to initialize multiple times"

    invoke-virtual {p1, p2}, Lcom/google/android/gms/measurement/internal/p2;->a(Ljava/lang/String;)V

    return-void
.end method

.method public isDataCollectionEnabled(Lcom/google/android/gms/internal/measurement/U0;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->f()Lcom/google/android/gms/measurement/internal/P2;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/measurement/internal/n5;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/measurement/internal/n5;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/U0;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/P2;->B(Ljava/lang/Runnable;)V

    return-void
.end method

.method public logEvent(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V
    .locals 10

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    move-object v0, p0

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object v2

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    move-wide/from16 v8, p6

    invoke-virtual/range {v2 .. v9}, Lcom/google/android/gms/measurement/internal/F3;->f0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V

    return-void
.end method

.method public logEventAndBundle(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/google/android/gms/internal/measurement/U0;J)V
    .locals 8

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    new-instance v0, Landroid/os/Bundle;

    if-eqz p3, :cond_0

    invoke-direct {v0, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_0

    :cond_0
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :goto_0
    const-string v1, "_o"

    const-string v5, "app"

    invoke-virtual {v0, v1, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/measurement/internal/E;

    new-instance v4, Lcom/google/android/gms/measurement/internal/D;

    invoke-direct {v4, p3}, Lcom/google/android/gms/measurement/internal/D;-><init>(Landroid/os/Bundle;)V

    move-object v2, v0

    move-object v3, p2

    move-wide v6, p5

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/measurement/internal/E;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/D;Ljava/lang/String;J)V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/S2;->f()Lcom/google/android/gms/measurement/internal/P2;

    move-result-object p2

    new-instance p3, Lcom/google/android/gms/measurement/internal/O3;

    invoke-direct {p3, p0, p4, v0, p1}, Lcom/google/android/gms/measurement/internal/O3;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/U0;Lcom/google/android/gms/measurement/internal/E;Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Lcom/google/android/gms/measurement/internal/P2;->B(Ljava/lang/Runnable;)V

    return-void
.end method

.method public logHealthData(ILjava/lang/String;Lcom/google/android/gms/dynamic/a;Lcom/google/android/gms/dynamic/a;Lcom/google/android/gms/dynamic/a;)V
    .locals 9

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    const/4 v0, 0x0

    if-nez p3, :cond_0

    move-object v6, v0

    goto :goto_0

    :cond_0
    invoke-static {p3}, Lcom/google/android/gms/dynamic/b;->j0(Lcom/google/android/gms/dynamic/a;)Ljava/lang/Object;

    move-result-object p3

    move-object v6, p3

    :goto_0
    if-nez p4, :cond_1

    move-object v7, v0

    goto :goto_1

    :cond_1
    invoke-static {p4}, Lcom/google/android/gms/dynamic/b;->j0(Lcom/google/android/gms/dynamic/a;)Ljava/lang/Object;

    move-result-object p3

    move-object v7, p3

    :goto_1
    if-nez p5, :cond_2

    :goto_2
    move-object v8, v0

    goto :goto_3

    :cond_2
    invoke-static {p5}, Lcom/google/android/gms/dynamic/b;->j0(Lcom/google/android/gms/dynamic/a;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_2

    :goto_3
    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/S2;->d()Lcom/google/android/gms/measurement/internal/n2;

    move-result-object v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    move v2, p1

    move-object v5, p2

    invoke-virtual/range {v1 .. v8}, Lcom/google/android/gms/measurement/internal/n2;->x(IZZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public onActivityCreated(Lcom/google/android/gms/dynamic/a;Landroid/os/Bundle;J)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/F3;->n0()Landroid/app/Application$ActivityLifecycleCallbacks;

    move-result-object p3

    if-eqz p3, :cond_0

    iget-object p4, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p4}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object p4

    invoke-virtual {p4}, Lcom/google/android/gms/measurement/internal/F3;->B0()V

    invoke-static {p1}, Lcom/google/android/gms/dynamic/b;->j0(Lcom/google/android/gms/dynamic/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-interface {p3, p1, p2}, Landroid/app/Application$ActivityLifecycleCallbacks;->onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public onActivityDestroyed(Lcom/google/android/gms/dynamic/a;J)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/F3;->n0()Landroid/app/Application$ActivityLifecycleCallbacks;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/F3;->B0()V

    invoke-static {p1}, Lcom/google/android/gms/dynamic/b;->j0(Lcom/google/android/gms/dynamic/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-interface {p2, p1}, Landroid/app/Application$ActivityLifecycleCallbacks;->onActivityDestroyed(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public onActivityPaused(Lcom/google/android/gms/dynamic/a;J)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/F3;->n0()Landroid/app/Application$ActivityLifecycleCallbacks;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/F3;->B0()V

    invoke-static {p1}, Lcom/google/android/gms/dynamic/b;->j0(Lcom/google/android/gms/dynamic/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-interface {p2, p1}, Landroid/app/Application$ActivityLifecycleCallbacks;->onActivityPaused(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public onActivityResumed(Lcom/google/android/gms/dynamic/a;J)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/F3;->n0()Landroid/app/Application$ActivityLifecycleCallbacks;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/F3;->B0()V

    invoke-static {p1}, Lcom/google/android/gms/dynamic/b;->j0(Lcom/google/android/gms/dynamic/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-interface {p2, p1}, Landroid/app/Application$ActivityLifecycleCallbacks;->onActivityResumed(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public onActivitySaveInstanceState(Lcom/google/android/gms/dynamic/a;Lcom/google/android/gms/internal/measurement/U0;J)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/F3;->n0()Landroid/app/Application$ActivityLifecycleCallbacks;

    move-result-object p3

    new-instance p4, Landroid/os/Bundle;

    invoke-direct {p4}, Landroid/os/Bundle;-><init>()V

    if-eqz p3, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/F3;->B0()V

    invoke-static {p1}, Lcom/google/android/gms/dynamic/b;->j0(Lcom/google/android/gms/dynamic/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-interface {p3, p1, p4}, Landroid/app/Application$ActivityLifecycleCallbacks;->onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V

    :cond_0
    :try_start_0
    invoke-interface {p2, p4}, Lcom/google/android/gms/internal/measurement/U0;->b(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/S2;->d()Lcom/google/android/gms/measurement/internal/n2;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/n2;->J()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object p2

    const-string p3, "Error returning bundle value to wrapper"

    invoke-virtual {p2, p3, p1}, Lcom/google/android/gms/measurement/internal/p2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onActivityStarted(Lcom/google/android/gms/dynamic/a;J)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/F3;->n0()Landroid/app/Application$ActivityLifecycleCallbacks;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/F3;->B0()V

    invoke-static {p1}, Lcom/google/android/gms/dynamic/b;->j0(Lcom/google/android/gms/dynamic/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-interface {p2, p1}, Landroid/app/Application$ActivityLifecycleCallbacks;->onActivityStarted(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public onActivityStopped(Lcom/google/android/gms/dynamic/a;J)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/F3;->n0()Landroid/app/Application$ActivityLifecycleCallbacks;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/F3;->B0()V

    invoke-static {p1}, Lcom/google/android/gms/dynamic/b;->j0(Lcom/google/android/gms/dynamic/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-interface {p2, p1}, Landroid/app/Application$ActivityLifecycleCallbacks;->onActivityStopped(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public performAction(Landroid/os/Bundle;Lcom/google/android/gms/internal/measurement/U0;J)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/measurement/U0;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method public registerOnMeasurementEventListener(Lcom/google/android/gms/internal/measurement/V0;)V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Ljava/util/Map;

    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/V0;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw3/v;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService$b;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService$b;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/V0;)V

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Ljava/util/Map;

    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/V0;->a()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/measurement/internal/F3;->l0(Lw3/v;)V

    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public resetAnalyticsData(J)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/measurement/internal/F3;->G(J)V

    return-void
.end method

.method public setConditionalUserProperty(Landroid/os/Bundle;J)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/S2;->d()Lcom/google/android/gms/measurement/internal/n2;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/n2;->E()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object p1

    const-string p2, "Conditional user property must not be null"

    invoke-virtual {p1, p2}, Lcom/google/android/gms/measurement/internal/p2;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/measurement/internal/F3;->M0(Landroid/os/Bundle;J)V

    return-void
.end method

.method public setConsent(Landroid/os/Bundle;J)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/measurement/internal/F3;->W0(Landroid/os/Bundle;J)V

    return-void
.end method

.method public setConsentThirdParty(Landroid/os/Bundle;J)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/measurement/internal/F3;->b1(Landroid/os/Bundle;J)V

    return-void
.end method

.method public setCurrentScreen(Lcom/google/android/gms/dynamic/a;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object p4, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p4}, Lcom/google/android/gms/measurement/internal/S2;->G()Lcom/google/android/gms/measurement/internal/w4;

    move-result-object p4

    invoke-static {p1}, Lcom/google/android/gms/dynamic/b;->j0(Lcom/google/android/gms/dynamic/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p4, p1, p2, p3}, Lcom/google/android/gms/measurement/internal/w4;->F(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setDataCollectionEnabled(Z)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/internal/F3;->a1(Z)V

    return-void
.end method

.method public setDefaultEventParameters(Landroid/os/Bundle;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/internal/F3;->V0(Landroid/os/Bundle;)V

    return-void
.end method

.method public setEventInterceptor(Lcom/google/android/gms/internal/measurement/V0;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    new-instance v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService$a;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService$a;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/V0;)V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/S2;->f()Lcom/google/android/gms/measurement/internal/P2;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/P2;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/google/android/gms/measurement/internal/F3;->m0(Lw3/w;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/S2;->f()Lcom/google/android/gms/measurement/internal/P2;

    move-result-object p1

    new-instance v1, Lcom/google/android/gms/measurement/internal/M4;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/measurement/internal/M4;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService$a;)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/measurement/internal/P2;->B(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setInstanceIdProvider(Lcom/google/android/gms/internal/measurement/a1;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    return-void
.end method

.method public setMeasurementEnabled(ZJ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/android/gms/measurement/internal/F3;->X(Ljava/lang/Boolean;)V

    return-void
.end method

.method public setMinimumSessionDuration(J)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    return-void
.end method

.method public setSessionTimeoutDuration(J)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/measurement/internal/F3;->U0(J)V

    return-void
.end method

.method public setSgtmDebugInfo(Landroid/content/Intent;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/internal/F3;->I(Landroid/content/Intent;)V

    return-void
.end method

.method public setUserId(Ljava/lang/String;J)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/measurement/internal/F3;->Z(Ljava/lang/String;J)V

    return-void
.end method

.method public setUserProperty(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/dynamic/a;ZJ)V
    .locals 7

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    invoke-static {p3}, Lcom/google/android/gms/dynamic/b;->j0(Lcom/google/android/gms/dynamic/a;)Ljava/lang/Object;

    move-result-object v3

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object v0

    move-object v1, p1

    move-object v2, p2

    move v4, p4

    move-wide v5, p5

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/measurement/internal/F3;->i0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V

    return-void
.end method

.method public unregisterOnMeasurementEventListener(Lcom/google/android/gms/internal/measurement/V0;)V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->j0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Ljava/util/Map;

    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/V0;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw3/v;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService$b;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService$b;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/V0;)V

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/S2;->F()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/measurement/internal/F3;->S0(Lw3/v;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
