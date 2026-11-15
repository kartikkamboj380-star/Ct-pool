.class public final LJ2/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:LJ2/a;

.field public final b:LJ2/a;


# direct methods
.method public constructor <init>(LJ2/a;LJ2/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LJ2/b$a;->a:LJ2/a;

    .line 5
    .line 6
    iput-object p2, p0, LJ2/b$a;->b:LJ2/a;

    .line 7
    .line 8
    return-void
.end method
