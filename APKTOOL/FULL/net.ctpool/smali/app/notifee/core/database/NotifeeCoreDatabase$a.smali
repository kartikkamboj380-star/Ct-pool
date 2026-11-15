.class public Lapp/notifee/core/database/NotifeeCoreDatabase$a;
.super LW/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lapp/notifee/core/database/NotifeeCoreDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0, p1, p2}, LW/b;-><init>(II)V

    return-void
.end method


# virtual methods
.method public a(LZ/g;)V
    .locals 1

    .line 1
    const-string v0, "ALTER TABLE work_data ADD COLUMN with_alarm_manager INTEGER NOT NULL DEFAULT 0"

    .line 2
    .line 3
    invoke-interface {p1, v0}, LZ/g;->u(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
