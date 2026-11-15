.class public abstract Landroidx/room/w$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/room/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# instance fields
.field public final version:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/room/w$b;->version:I

    return-void
.end method


# virtual methods
.method public abstract createAllTables(LZ/g;)V
.end method

.method public abstract dropAllTables(LZ/g;)V
.end method

.method public abstract onCreate(LZ/g;)V
.end method

.method public abstract onOpen(LZ/g;)V
.end method

.method public abstract onPostMigrate(LZ/g;)V
.end method

.method public abstract onPreMigrate(LZ/g;)V
.end method

.method public abstract onValidateSchema(LZ/g;)Landroidx/room/w$c;
.end method

.method protected validateMigration(LZ/g;)V
    .locals 1

    .line 1
    const-string v0, "db"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    const-string v0, "validateMigration is deprecated"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method
