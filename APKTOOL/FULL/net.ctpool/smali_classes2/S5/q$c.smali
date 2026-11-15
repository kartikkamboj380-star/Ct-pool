.class public LS5/q$c;
.super Landroidx/room/A;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS5/q;-><init>(Landroidx/room/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>(LS5/q;Landroidx/room/u;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Landroidx/room/A;-><init>(Landroidx/room/u;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public createQuery()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "DELETE FROM work_data"

    .line 2
    .line 3
    return-object v0
.end method
